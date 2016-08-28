import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String background_image;
	public String state;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String logo;
	public String name;
	public String topic;
	public String privacy;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String type;
	public String email;
	public String timezone;
	public VersionModel _version;

	public RootModel(CopyrightModel copyright, String schedule_published_on, String background_image, String state, int id, Call_for_papersModel call_for_papers, String start_time, String organizer_name, CreatorModel creator, String description, ArrayList<Social_linksModel> social_links, String location_name, String logo, String name, String topic, String privacy, String end_time, String organizer_description, String code_of_conduct, String type, String email, String timezone, VersionModel version) {

		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.state = state;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.description = description;
		this.social_links = social_links;
		this.location_name = location_name;
		this.logo = logo;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.email = email;
		this.timezone = timezone;
		this._version = version;

	}

}