import java.util.ArrayList;

class RootModel {

	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String code_of_conduct;
	public String email;
	public String state;
	public String name;
	public int id;
	public VersionModel _version;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String end_time;
	public String organizer_name;
	public String organizer_description;
	public String timezone;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String background_image;
	public String privacy;
	public String description;
	public String topic;

	public RootModel(String location_name, Call_for_papersModel call_for_papers, String logo, String code_of_conduct, String email, String state, String name, int id, VersionModel version, String type, ArrayList<Social_linksModel> social_links, String start_time, String end_time, String organizer_name, String organizer_description, String timezone, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String background_image, String privacy, String description, String topic) {

		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.state = state;
		this.name = name;
		this.id = id;
		this._version = version;
		this.type = type;
		this.social_links = social_links;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.background_image = background_image;
		this.privacy = privacy;
		this.description = description;
		this.topic = topic;

	}

}