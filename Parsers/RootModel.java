import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public String topic;
	public String privacy;
	public String description;
	public String name;
	public String start_time;
	public CopyrightModel _copyright;
	public String state;
	public String timezone;
	public String type;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String email;
	public String background_image;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public int id;
	public String code_of_conduct;
	public VersionModel _version;

	public RootModel(String organizer_name, String logo, String schedule_published_on, String topic, String privacy, String description, String name, String start_time, CopyrightModel copyright, String state, String timezone, String type, String location_name, Call_for_papersModel call_for_papers, String organizer_description, String email, String background_image, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, int id, String code_of_conduct, VersionModel version) {

		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.privacy = privacy;
		this.description = description;
		this.name = name;
		this.start_time = start_time;
		this._copyright = copyright;
		this.state = state;
		this.timezone = timezone;
		this.type = type;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.email = email;
		this.background_image = background_image;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._version = version;

	}

}