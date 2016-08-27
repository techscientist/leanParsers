import java.util.ArrayList;

class RootModel {

	public String email;
	public String timezone;
	public String state;
	public String topic;
	public int id;
	public String description;
	public String type;
	public String name;
	public String logo;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public String privacy;
	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String organizer_name;
	public String background_image;
	public VersionModel _version;

	public RootModel(String email, String timezone, String state, String topic, int id, String description, String type, String name, String logo, String code_of_conduct, String start_time, CreatorModel creator, String privacy, String end_time, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String schedule_published_on, CopyrightModel copyright, String organizer_description, String organizer_name, String background_image, VersionModel version) {

		this.email = email;
		this.timezone = timezone;
		this.state = state;
		this.topic = topic;
		this.id = id;
		this.description = description;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.privacy = privacy;
		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._version = version;

	}

}