import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_description;
	public VersionModel _version;
	public String state;
	public String background_image;
	public String schedule_published_on;
	public String description;
	public String location_name;
	public String timezone;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String start_time;
	public String end_time;
	public int id;
	public CopyrightModel _copyright;
	public String name;
	public String logo;

	public RootModel(String privacy, String organizer_description, VersionModel version, String state, String background_image, String schedule_published_on, String description, String location_name, String timezone, String email, ArrayList<Social_linksModel> social_links, String organizer_name, String code_of_conduct, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, String type, String start_time, String end_time, int id, CopyrightModel copyright, String name, String logo) {

		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._version = version;
		this.state = state;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.location_name = location_name;
		this.timezone = timezone;
		this.email = email;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.start_time = start_time;
		this.end_time = end_time;
		this.id = id;
		this._copyright = copyright;
		this.name = name;
		this.logo = logo;

	}

}