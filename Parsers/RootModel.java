import java.util.ArrayList;

class RootModel {

	public String description;
	public String topic;
	public CopyrightModel _copyright;
	public String type;
	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public String logo;
	public String name;
	public String schedule_published_on;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_description;
	public String state;
	public String end_time;
	public String location_name;
	public String organizer_name;
	public int id;
	public VersionModel _version;

	public RootModel(String description, String topic, CopyrightModel copyright, String type, String privacy, String code_of_conduct, String background_image, String logo, String name, String schedule_published_on, String email, Call_for_papersModel call_for_papers, String timezone, CreatorModel creator, ArrayList<Social_linksModel> social_links, String start_time, String organizer_description, String state, String end_time, String location_name, String organizer_name, int id, VersionModel version) {

		this.description = description;
		this.topic = topic;
		this._copyright = copyright;
		this.type = type;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._creator = creator;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.id = id;
		this._version = version;

	}

}